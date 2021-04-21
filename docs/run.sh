#! /usr/bin/env bash
set -e
BASEDIR=$(dirname "$0")
VIRTUALENV_DIR="$BASEDIR/p3"

if [[ ! -d "$VIRTUALENV_DIR" ]]; then
    python -m pip install virtualenv
    python -m virtualenv -p python3 "$VIRTUALENV_DIR"
fi
source "$VIRTUALENV_DIR/bin/activate"
pip install -r requirements.txt
mkdocs serve
