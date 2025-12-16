echo "Enter first number"
read a

echo "Enter second number"
read b

echo "Enter operator (+ - * /)"
read op

if [ "$op" = "+" ]; then
    result=$((a + b))
    echo "Result = $result"

elif [ "$op" = "-" ]; then
    result=$((a - b))
    echo "Result = $result"

elif [ "$op" = "*" ]; then
    result=$((a * b))
    echo "Result = $result"

elif [ "$op" = "/" ]; then
    result=$((a / b))
    echo "Result = $result"

else
    echo "Invalid operator"
fi
