# godot-unpacker.py
# version 0.1
# https://github.com/tehskai/godot-unpacker

import sys
import os
import pathlib
import mmap
import struct

def main(args):
	rip_textures = True # change to False if you want textures untouched in godot .tex format
	if not args:
		return "Usage: python godot-unpacker.py data.pck"
	if not os.path.exists(args[0]):
		return "Error: file not found"
	file_list = []
	with open(args[0], "r+b") as d:
		f = mmap.mmap(d.fileno(), 0)
		magic = bytes.fromhex('47 44 50 43') # GDPC
		if f.read(4) == magic:
			print(args[0] + " looks like a pck archive")
			f.seek(0)
		else:
			f.seek(-4, os.SEEK_END)
			if f.read(4) == magic:
				print(args[0] + " looks like a self-contained exe")
				f.seek(-12, os.SEEK_END)
				main_offset = int.from_bytes(f.read(8), byteorder='little')
				f.seek(f.tell()-main_offset-8)
				if f.read(4) == magic:
					f.seek(f.tell()-4)
			else:
				f.close()
				return "Error: file not supported"
		package_headers = struct.unpack_from("IIIII16II", f.read(20+64+4))
		print (args[0] + " info:", package_headers)
		file_count = package_headers[-1]

		for file_num in range(1, file_count+1):
			filepath_length = int.from_bytes(f.read(4), byteorder="little")
			file_info = struct.unpack_from("<{}sQQ16B".format(filepath_length), f.read(filepath_length+8+8+16))
			path, offset, size = file_info[0:3]
			path = path.decode("utf-8").replace("res://","")
			md5 = "".join([format(x, 'x') for x in file_info[-16:]])
			file_list.append({ 'path': path, 'offset': offset, 'size': size, 'md5': md5 })
			print(file_num, "/", file_count, sep="", end=" ")
			print(path, offset, size, md5)

		for packed_file in file_list:
			path = os.path.join("output", os.path.dirname(packed_file['path']))
			file_name_full = os.path.basename(packed_file['path'])
			file_name, file_extension = os.path.splitext(file_name_full)
			pathlib.Path(path).mkdir(parents=True, exist_ok=True)
			f.seek(packed_file['offset'])
			file_data = f.read(packed_file['size'])
			# do md5 check here
			if file_extension == '.tex' and rip_textures:
				data = rip_texture(file_data)
				if isinstance(data, list):
					file_extension, file_data = data
					file_name_full = file_name + data[0]
			with open(os.path.join(path, file_name_full.rstrip("\0")), "w+b") as p:
				p.write(file_data)
		f.close()

def rip_texture(data):
	# webp
	start = data.find(bytes.fromhex("52 49 46 46"))
	if start >= 0:
		size = int.from_bytes(data[start+4:start+8], byteorder="little")
		return [".webp", data[start:start+8+size]]

	# png
	start = data.find(bytes.fromhex("89 50 4E 47 0D 0A 1A 0A"))
	if start >= 0:
		end = data.find(bytes.fromhex("49 45 4E 44 AE 42 60 82")) + 8
		return [".png", data[start:end]]

	# jpg
	start = data.find(bytes.fromhex("FF D8 FF"))
	if start >= 0:
		end = data.find(bytes.fromhex("FF D9")) + 2
		return [".jpg", data[start:end]]
	return False

if __name__ == "__main__":
    sys.exit(main(sys.argv[1:]))
