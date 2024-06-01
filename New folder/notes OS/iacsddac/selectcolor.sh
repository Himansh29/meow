
choice="a"
while [ $choice != "E" -o $choice != "e" ]
do

echo "R. Red"
echo "Y. yellow"
echo "B. blue"
echo "E. exit"
echo "choice"
read choice
case $choice in
	[Rr])echo "you selected red"
		echo "I like red roses"
	;;
        [Yy])echo "you selected yellow"
		echo "yellow yellow dirty fellow"
		;;
	[bB])echo "you selected blue"
		echo "ther is blue sky in rainy season"
		;;
	[Ee])exit;;
	*)echo "your choice is wrong"
esac
done
