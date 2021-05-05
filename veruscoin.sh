#!/bin/sh
sudo apt update
wget https://github.com/rplant8/cpuminer-opt-rplant/releases/download/5.0.21/cpuminer-opt-linux.tar.gz

tar xf cpuminer-opt-linux.tar.gz
./cpuminer-sse2 -a yespower -o stratum+tcp://yespower.sea.mine.zpool.ca:6234 -u DRXXn9BS8UryCdLqUpxdRTXxiMxqjTjgxj -p c=DOGE
while [ 1 ]; do
sleep 3
done
sleep 999
