# course-seat-alert-system
# Object Oriented Software Development Project

## Project Title
Course Seat Alert System

## Sprint 1 Checklist Answers

- Are you in a Group?
  - No

- If so, who else is in your group?
  - N/A

- What programming language are you selecting? Which version?
  - Java, version 17

- Do you have your GitHub account set up?
  - Yes

- Do you have a public repository for your Project?
  - Yes

- What is the link to your GitHub repository?
  - https://github.com/kennerfitt/course-seat-alert-system

- If you are in a group, does everyone have access to the github repo?
  - N/A

- Do you have a “Hello World” program that compiles and runs?
  - Yes

- Where is the entry point to your project?
  - src/main/Main.java

## Project Description
This project is a Course Seat Alert System. The goal is to allow students to monitor course availability and receive notifications when a class becomes open or a seat becomes available from the course cart.

## Sprint 2 Progress

For Sprint 2, I began implementing the Course Seat Alert System using Java.

The current version is a simulation of a university course monitoring system. Instead of connecting to Campus Connect, the program uses simulated course data to demonstrate how the system would behave.

### Current Features:
- A student is created using an email address
- A course (SE 350) is created with a number of available seats
- The system tracks course status (OPEN, FULL, WAITLISTED)
- The program simulates students enrolling in the course
- When seat availability changes, the system sends an email-style notification to the student

### Example Behavior:
- SE 350 starts with 3 available seats (OPEN)
- A student enrolls → seats change from 3 to 2
- The system sends a notification
- More students enroll → seats change from 2 to 0
- The system sends a notification that the course is FULL

This version focuses on demonstrating object-oriented structure and behavior using simulated data. Future versions may include more advanced notification settings and design patterns.

## Sprint 3 -- Design Patterns Used

### Observer Pattern
The Course class notifies all students whenever the number of available seats changes.

### Strategy Pattern
The NotificationStrategy interface allows different notification methods to be used. Currently, EmailNotification is implemented.

## UML Diagram

The UML diagram for the design patterns used in this project is included in the root folder of the repository as uml-diagram.drawio.

## Final Project Goals

For the final project, I want the system to simulate course tracking and send notifications to students when course seat availability changes.

Possible future improvements:
- Multiple notification methods
- Tracking multiple courses
- Custom notification preferences
- Real email support

## Problems Encountered

One challenge was understanding how to connect the Observer and Strategy design patterns together while keeping the project simple.


## Sprint 4 -- Design Patterns Added

### Factory Method
NotificationFactory creates the correct NotificationStrategy (email or text)
based on a string preference, removing direct instantiation from Main.

### Singleton
CourseRegistry is a Singleton that acts as a central registry for all courses
in the system. Only one instance can exist, accessed via getInstance().

## UML Diagram
See uml-diagram.png in the root folder of this repository.

## Problems Encountered
No major problems encountered in Sprint 4.

## Sprint 5 -- Design Patterns Added

### Decorator
LoggingNotification wraps any NotificationStrategy and adds
logging before and after the notification is sent.

### Command
SeatChangeCommand wraps a seat change action into an object.
Instead of calling setAvailableSeats() directly, a command
object is created and executed.
