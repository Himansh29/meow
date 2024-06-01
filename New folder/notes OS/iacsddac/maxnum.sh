echo "enter number"
read num1
echo "enter num"
read num2
if [ $num1 -gt $num2 ]
then
	echo "maximum : $num1"
else
	echo "maximum : $num2"
fi
