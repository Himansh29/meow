echo "enter file name"
read fn
if [ -f $fn ]
then
	echo "file exists overwrite"
	read ans
	if [ $ans = "y" ]
	then
		cat > $fn
		echo "file created"
	else
		echo "not overriting"
	fi

else
	cat> $fn
fi

