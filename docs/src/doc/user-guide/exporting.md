## Exporting games

To export game, you should copy exports in right template folder, which should be:  
- Windows: `%APPDATA%\Godot\templates\<godot-version>`
- Linux: `~/.local/share/godot/templates/<godot-version>`  

You should also renamed the `release` export to:  
- Windows: `windows_64_release.exe`
- Linux: `linux_x11_64_release`

And `release_debug` to:
- Windows: `windows_64_debug.exe`
- Linux: `linux_x11_64_debug`

On osx use the script mentionned in [this issue](https://github.com/godotengine/godot-docs/issues/3194#issuecomment-588862977),
this will do the job for you.

Then you can export your game as usual, your game `jar` will be included in `pck`.  
On desktop platforms, this also copies the jre folder of your project in the exported game folder.

## Particularities

`godot-bootstrap.jar` and `main.jar` are set into `pck` during the export process. Also, as a real file path is needed to
handle them, they are copied on the first game version start from `res://` to `user://` (We check if exists and also md5)
to only update when needed.  
Don't forget to remove them when uninstalling the game.