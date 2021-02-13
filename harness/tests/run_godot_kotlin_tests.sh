$1 -d -s --path $PWD addons/gut/gut_cmdln.gd | ( no_error="false"; jvm_closed="false"; while read -r line
do
    echo "$line"
    if echo "$line" | grep -q "Failing asserts:  0"; then
        no_error="true"
    fi
    if echo "$line" | grep -q "Shutting down JVM ..."; then
        jvm_closed="true"
    fi
done
if [[ "$no_error" == "false" ]]; then
    echo "ERROR: Some assertions failed !"
    exit 1
elif [[ "$jvm_closed" == "false" ]]; then
    echo "ERROR: JVM has not closed properly !"
    exit 1
else
    echo "All tests OK !"
    exit 0
fi
); exit $?
