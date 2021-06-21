# CS-320-SoftwareTestAutomation
How can I ensure that my code, program, or software is functional and secure? 
To ensure that my code is functional and secure I needed to test for possible use cases. When doing this I had to make sure the requirements are addressed and make sure my tests are not bias. As the developer we want our code to pass our tests and this could lead to non-extensive tests and may miss certain use cases and scenarios that could potentially break the code.

How do I interpret user needs and incorporate them into a program? 
To incorpoorate user needs into the program is by ensuring my requirements gathering is thorough. Throughout my development and tests I would reference user needs and requirements. Having the requirements of a project well laid out before hand is crucial to being able to ensure I am not missing any of my users' needs. As this project is well laid out ahead of time it was much easier, but in other projects I must remain agile and be able to adjust to changes and additional requirements.

How do I approach designing software?
My approach to software design is simplicity and functionality. It is easy to make simple mistakes in software when your designs become overly complex. It is important that my software functions properly and meets all requirements, but I will also need to make revisions if the code is overly complicated or contains ambiguous parts.
I ensured that I followed the guidelines and requirements of this assignment as listed below. 


Directions
ContactService, TaskService, and AppointmentService Files
For this assignment, you will incorporate the code and unit tests that you have developed for the mobile application. First, you developed the contact service and contact object, which you completed in the Module Three milestone. Second, you developed the task service and task object, which you completed in the Module Four milestone. Last, you developed the appointment service and appointment object, which you completed in Module Five milestone. Any feedback received on these assignments should be incorporated prior to submitting the files for this final project.

You have been asked to code up a mobile application for a client and provide unit tests to verify that it meets the customer’s requirements. In order to do so, you must complete the following:

Contact Service: In the Module Three milestone, you developed the contact service. The contact service used in-memory data structures to support storing contacts (no database required). In addition, there was no UI for this assignment. You verified the contact service through JUnit tests. The contact service contained a contact object along with the contact service. The requirements were as follows:
Contact Class Requirements
The contact object shall have a required unique contact ID String that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
Contact Service Requirements
The contact service shall be able to add contacts with unique ID.
The contact service shall be able to delete contacts per contactId.
The contact service shall be able to update contact fields per contactId. The following fields are updatable:
firstName
lastName
PhoneNumber
Address
Task Service: In the Module Four milestone, you developed the task service. The task service used in-memory data structures to support storing tasks (no database required). In addition, there was no UI for this assignment. You verified the task service through JUnit tests. The task service contained a task object along with the task service. The requirements were as follows:
Task Requirements
The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Task Service Requirements
The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per taskId.
The task service shall be able to update task fields per taskId. The following fields are updatable:
name
description
Appointment Service: In the Module Five milestone, you developed the appointment service. The appointment service used in-memory data structures to support storing appointments (no database required). In addition, there was no UI for this assignment. You verified the appointment service through JUnit tests. The appointment service contained an appointment object along with the appointment service. The requirements were as follows:
Appointment Requirements
The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
The appointment object shall have a required appointment Date field. The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Appointment Service Requirements
The appointment service shall be able to add appointments with a unique appointmentId.
The appointment service shall be able to delete appointments per appointmentId.
Specifically, the following rubric criteria must be addressed:

Verify the Contact class meets the requirements through JUnit tests.
Verify the ContactService class meets the requirements through JUnit tests.
Verify the Task class meets the requirements through JUnit tests.
Verify the TaskService class meets the requirements through JUnit tests.
Verify the Appointment class meets the requirements through JUnit tests.
Verify the AppointmentService class meets the requirements through JUnit tests.
Ensure the test coverage for the java files has 80% coverage or higher.
