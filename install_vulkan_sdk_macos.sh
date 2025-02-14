#!/usr/bin/env sh

set -euo pipefail
IFS=$'\n\t'

# Download and install the Vulkan SDK.
curl -L "https://sdk.lunarg.com/sdk/download/latest/mac/vulkan-sdk.zip" -o /tmp/vulkan-sdk.zip
unzip -l /tmp/vulkan-sdk.zip | grep 'InstallVulkan.*\.app' | head -n 1 | awk '{print $4}' | tr -d '/' > /tmp/install_app_name

unzip /tmp/vulkan-sdk.zip -d /tmp
install_app_name=$(cat /tmp/install_app_name)
/tmp/$install_app_name/Contents/MacOS/${install_app_name%\.app} \
    --accept-licenses --default-answer --confirm-command install

rm -rf /tmp/$install_app_name
rm -f /tmp/vulkan-sdk.zip
rm -f /tmp/install_app_name

echo 'Vulkan SDK installed successfully! You can now build Godot by running "scons".'