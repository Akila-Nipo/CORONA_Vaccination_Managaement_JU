
# University Vaccination Management App

A Java-based application designed to manage and track COVID-19 vaccination statuses for students and teachers of a university, integrating functionality with the Surokkha platform.

## 📚 Course Information

- **Course Title**: Object Oriented Programming (JAVA)  
- **Course Code**: CSE-212  
- **Semester**: 2nd Year, 1st Semester Examination 2021  
- **Submitted To**:  
  - Dr. Md. Ezharul Islam (Professor)  
  - Dr. Md. Musfique Anwar ( Professor)  
- **University**: Jahangirnagar University  

## 👩‍🎓 Submitted By

- **Name**: Akila Nipo  
- **Class Roll**: 368  
- **Exam Roll**: 202180  

---

## 📑 Table of Contents

1. [UML Diagram](#-uml-diagram)
2. [Project Description](#-project-description)
3. [OOP Features Used](#-object-oriented-programming-oop-features-used)
4. [Code](#-code)
5. [Output Screenshots](#-output-screenshots)
6. [GUI Presentation](#-gui-presentation)
7. [Run Locally in NetBeans](#-how-to-run-the-project-locally-netbeans-ide)

---

## 🧩 UML Diagram

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/CLASSDIAGRAM.jpg" alt="project logo">
</p>


---

## 📌 Project Description

### 📌 Project Title
**University Vaccination Management App**

### 🎯 Goals
To bring all teachers and students of a university under a centralized vaccination management system.

### 👥 Stakeholders

| Name         | Role |
|--------------|------|
| **Surokkha App** | - Facilitates registration for vaccination  
- Allows printing vaccine cards  
- Provides vaccination status updates |
| **University** | - Registers and monitors students and teachers  
- Maintains departmental vaccination logs |

### ✅ Features

#### Surokkha App
- Register
- Print Vaccine Card
- Check Vaccination Status
- Update Doses

#### University Management App
- Register Teacher
- Register Student
- Show Department-Wise Vaccination Records
- Print Vaccine Cards

---

## 🧠 Object-Oriented Programming (OOP) Features Used

In this project, I have **manipulated and implemented key OOP principles** — including **inheritance, polymorphism, encapsulation, abstraction**, and **function overriding** — to build a real-world vaccination management system for a university. Below is how each concept has been utilized:

### 🔁 1. Inheritance

I used **inheritance** to eliminate code duplication and to build relationships between common entities:

- A base class `PERSON` is created, which contains shared attributes like `name`, `nid`, `contact`, and shared methods such as `SetInfo()` and `DisplayInfo()`.
- Both `STUDENT` and `TEACHER` classes **inherit** from `PERSON`, allowing them to reuse and extend the functionalities.

```java
class STUDENT extends PERSON { ... }
class TEACHER extends PERSON { ... }
```

---

### 🔄 2. Polymorphism

#### 🕒 Run-time Polymorphism (Function Overriding)
I have **overridden** methods such as `ProvideINFO()` and `ShowINFO()` in both `STUDENT` and `TEACHER` classes, which originally exist in the `PERSON` class. This allowed me to tailor the behavior for each specific class.

#### 🧮 Compile-time Polymorphism (Constructor Overloading)
In the `SUROKKHA` class, I overloaded constructors to allow object creation with different sets of data.

---

### 🔐 3. Encapsulation

I grouped relevant data into classes and kept direct access controlled:

- Attributes like `name`, `nid`, `doses`, etc. are bundled inside classes.
- Data is accessed and modified only through **methods**, maintaining **data integrity**.

---

### 🧊 4. Abstraction

The `PERSON` class works as a **base abstraction**, hiding implementation details from other parts of the system:

- `PERSON` defines abstract-like methods (`ProvideINFO()`, `ShowINFO()`) that are specialized in the `STUDENT` and `TEACHER` classes.

---

### 🔄 5. Function Overriding

The project heavily uses **function overriding** to change the behavior of base class methods for different subclasses.

---

## 💻 Code

All Java code is included in `University.java` and contains the following classes:

- `SUROKKHA` - Manages vaccine registration and status.
- `PERSON` - Abstract class extended by `STUDENT` and `TEACHER`.
- `STUDENT` - Inherits from `PERSON` with department, session, and roll information.
- `TEACHER` - Inherits from `PERSON` with department and designation.
- `University` - Main class handling input/output and file operations.

> ⚠ Files used for data persistence:
- `studentsfile.data`
- `teachersfile.data`
- `surokkha.data`

---

## 📸 Output Screenshots



---

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/1.jpg" alt="project logo">
</p>
<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/2.jpg" alt="project logo">
</p>

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/3.jpg" alt="project logo">
</p>

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/4.jpg" alt="project logo">
</p>

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/5.jpg" alt="project logo">
</p>

<p align="center">
    <img src="https://github.com/Akila-Nipo/django_temporary/blob/main/6.jpg" alt="project logo">
</p>
---

## 🛠️ How to Run the Project Locally (NetBeans IDE)

### ✅ Requirements

- [NetBeans IDE](https://netbeans.apache.org/)
- JDK 8 or higher

### 📦 Project Files Structure

```
UniversityVaccination/
├── src/
│   └── University.java
├── studentsfile.data      ← (Generated after first run)
├── teachersfile.data      ← (Generated after first run)
├── surokkha.data          ← (Generated after first run)
```

### 🚀 Setup Instructions

1. **Open NetBeans**
   - Go to `File` > `New Project`
   - Choose `Java > Java Application`
   - Name the project (e.g., `UniversityVaccination`)
   - Click `Finish`

2. **Add the Code**
   - Replace the `Main.java` file with the provided `University.java` file.
   - Or right-click `Source Packages` > `New > Java Class` > name it `University` and paste the code.

3. **Run the Project**
   - Click the green **Run** button ▶
   - The app will open in the NetBeans terminal window.

4. **File Persistence**
   - After running once, three `.data` files will be created for storing:
     - Student Records
     - Teacher Records
     - Vaccination Info

---

## 📌 THE END
Thank you for reviewing this project! Feel free to contribute, fork, or raise issues.
