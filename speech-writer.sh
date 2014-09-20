#!/bin/sh
SPEECH='speech.txt'
perl -ne 'print if /^\?\?\?$/../^---$/' index.html > $SPEECH
echo "Your speech has been written to $SPEECH. Break a leg!"
