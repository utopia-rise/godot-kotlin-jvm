$1 -s --headless --path $PWD addons/gut/gut_cmdln.gd | (
    tests=0
    passing=0
    jvm_closed=0

    while read -r line
    do
        echo "$line"

        # Capture the number of tests
        if echo "$line" | grep -q "Tests"; then
            tests=$(echo "$line" | awk '{print $2}')
        fi

        # Capture the number of passing tests
        if echo "$line" | grep -q "Passing"; then
            passing=$(echo "$line" | awk '{print $2}')
        fi

        #Capture if JVM has closed
        if echo "$line" | grep -q "Shutting down JVM ..."; then
            jvm_closed=1
        fi
    done

    if [[ "$tests" -eq 0 ]]; then
       echo "ERROR: No tests were found."
       exit 1
    fi

    if [[ "$jvm_closed" -eq 0 ]]; then
       echo "ERROR: JVM has not closed properly !"
       exit 1
    fi

    if [[ "$tests" -eq "$passing" ]]; then
        exit 0
    else
        echo "ERROR: Some assertions failed!"
        exit 1
    fi
)

result=$?

# Exit with the result of the subshell
exit $result
