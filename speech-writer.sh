#!/bin/sh
SPEECH='speech.md'
perl -ne 'print if /^\?\?\?$/../^---$/' index.html | grep -v '^[?][?][?]$' > $SPEECH
echo "Your speech has been written to $SPEECH. Break a leg!"
