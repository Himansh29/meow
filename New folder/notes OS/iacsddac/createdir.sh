echo "enter directry name"
read nm
echo "enter filename"
read fn
if mkdir $nm
then
	cd $nm
	cat>$fn
else
	echo "could not create a folder"
fi


