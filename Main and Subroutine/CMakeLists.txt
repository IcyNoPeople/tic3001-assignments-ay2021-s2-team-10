cmake_minimum_required(VERSION 3.12)
project(Main_and_Subroutine)

set(CMAKE_CXX_STANDARD 14)

add_executable(Main_and_Subroutine
        "out/production/Main and Subroutine/main/Alphabetizer.class"
        "out/production/Main and Subroutine/main/CircularShift.class"
        "out/production/Main and Subroutine/main/Input.class"
        "out/production/Main and Subroutine/main/MasterControl.class"
        "out/production/Main and Subroutine/main/Output.class"
        src/main/Alphabetizer.java
        src/main/CircularShift.java
        src/main/Input.java
        src/main/MasterControl.java
        src/main/Output.java
        "Main and Subroutine.iml")
