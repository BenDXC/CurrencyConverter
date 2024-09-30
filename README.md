# CurrencyConverter
The Currency Converter Project is designed to be an application using Java
to create a tool that allows users to convert amounts between different currencies. 
This project utilizes the Open-AR-API for fetching real-time exchange rate data and provides an interface for users to specify the amount in one currency and get the equivalent amount in another currency.
It is a CLI interface

# Project Structure

```
|
|- src
|  |- main.java
|  |- HTTPRequest.java
|- README.md
|- requirements.txt
```

# Usage

1. Running it requires the JSONObject Dependency which is found in the pom.xml file
2. Running it requires the open -ar API currency rate

# Steps
![image](https://github.com/user-attachments/assets/4a25956e-5c6d-431e-81e8-9d3c70a6ee8a)

![image](https://github.com/user-attachments/assets/b47c8ae0-3006-421a-bd34-d47f2a6253c1)

![image](https://github.com/user-attachments/assets/f974fd2e-28f3-4e95-8331-de9e0ebe94d0)

![image](https://github.com/user-attachments/assets/6b3340d6-0977-4339-9412-ae2a9e7b6833)


1. Input the 1st Currency from 1 to 5
2. Input the 2nd currency from 1 to 5
3. Input the amount
4. it will convert the amount to the 2nd currency and it will run again until you input any other number after each conversion
