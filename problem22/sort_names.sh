#!/bin/bash

set -e

INPUT="names.txt"
OUTPUT="sorted_names.txt"

rm -f $OUTPUT
cat $INPUT | tr "," "\n" | sed -e 's|["'\'']||g' | sort > $OUTPUT

