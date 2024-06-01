echo "enter number"
read num
for (( i=1;i<11;i++)){
	d=`expr $num \* $i`
	echo "$num X $i = $d"

}
