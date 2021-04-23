## General
We are working with the Code Owners feature of GitHub. This means each piece of code in our module has a maintainer who is the "Owner" of said code. This maintainer is usually the one who implemented it or has the most knowledge about that particular part of the module. General code may not have a specific "Owner". In this case the fallback is: all Maintainers.

## Before Contributing
Before you start to invest your precious time in writing code that you want to contribute, consider following these guidelines. They are here to make the lives of all people involved easier.

- If you have an idea or a bug you want to fix, first look if an issue already exists that describes this Feature/Bug.
- If such a issue exists, and a person is already assigned, it means the assigned person is working on it. But don't go away yet! Maybe this person could need your help, or you have some valuable input for the topic.
- If the issue exists, but no one is assigned. You are free to state your interest in implementing/fixing the issue. But don't just start working. To prevent multiple people working on the same issue, we need to know you're working on it. Write in the issue, so we can assign it to you.
- If the issue does not yet exist, open one and describe as best as you can, what your idea/what the bug is you want to tackle. The provided templates are a good starting point.

## Code
- **CodeStyle:**  
We enforce the code style to match the official Kotlin [coding conventions](https://kotlinlang.org/docs/reference/coding-conventions.html). Read there on how to set those up for your IDE.
We will enforce this later on through CI and linting.  
- **Branching:**  
We do branching like described in `git-flow`.