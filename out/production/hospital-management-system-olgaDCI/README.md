## Exercise: Encapsulation - Hospital Management System

#### Objective:

Practice encapsulation and object-oriented programming in Java by creating a hospital management system.

#### Description:

You should create a hospital management system that simulates various operations such as adding patients, assigning doctors, scheduling appointments, and managing medical records. Implement multiple classes to model different aspects of the system, ensuring proper encapsulation and security.

#### Guidelines:

1.	Create a Patient class that represents a patient in the hospital.
    -	Include the following instance variables, and ensure proper encapsulation:
    -	String patientId
    -	String patientName
    -	String dateOfBirth
    -	Implement getter and setter methods for the instance variables.
    -	Create a constructor to initialize the patient's ID, name, and date of birth.
    -	Include a method to display the patient's information.
2.	Create a Doctor class that represents a doctor in the hospital.
    -	Include the following instance variables, and ensure proper encapsulation:
    -	String doctorId
    -	String doctorName
    -	String specialization
    -	Implement getter and setter methods for the instance variables.
    -	Create a constructor to initialize the doctor's ID, name, and specialization.
    -	Include a method to display the doctor's information.
3.	Appointment Class:
    -	Create an Appointment class to schedule appointments between patients and doctors.
    -	Include the following instance variables, and ensure proper encapsulation:
    -	Patient patient
    -	Doctor doctor
    -	String date
    -	String time
    -	Implement getter and setter methods for the instance variables.
    -	Create a constructor to initialize the appointment with a patient, doctor, date, and time.
    -	Include a method to display the appointment details.
4.	Hospital Class: 
    -	Create a Hospital class to manage hospital operations.
    -	Use ArrayList to store patients, doctors, and appointments.
    -	Include methods for adding patients, adding doctors, scheduling appointments, and displaying patient and doctor information.
    -	Ensure that patient IDs and doctor IDs are unique.
5.	Main Application:
    -	In the main method, create an instance of the Hospital class.
    -	Demonstrate the functionality of the hospital management system by adding patients, adding doctors, scheduling appointments, and displaying information.
