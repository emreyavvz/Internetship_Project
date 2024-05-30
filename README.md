# Mersys.io Web UI Test Automation Project

## Overview

This project aims to automate the testing of the web user interface for [Mersys.io](https://test.mersys.io), a comprehensive learning management suite designed for K-12 education and employee training. The automation framework will ensure the reliability and functionality of various features within the platform.

## User Stories

### Authentication and Navigation
1. **US_001_Login_Feature**: Validate the login functionality for users.
2. **US_002_Home_Logo**: Verify the visibility and functionality of the home logo.
3. **US_003_Top_Nav**: Ensure the top navigation bar is functional and responsive.
4. **US_004_Hamburger_Menu_Messaging**: Test the functionality of the hamburger menu, especially focusing on the messaging section.

### Messaging
5. **US_005_Message_Sending**: Test the message sending feature.
6. **US_006_Message_Deletion**: Validate the message deletion functionality.
7. **US_007_Restoration_and_Permanent_Deletion**: Ensure messages can be restored or permanently deleted as intended.

### Finance
8. **US_008_Finance_Page**: Verify the functionality of the finance page.
9. **US_009_Fee_Details**: Test the display and accuracy of fee details.
10. **US_010_Fee_Payment**: Validate the fee payment process.
11. **US_011_235_Dolar_Fee_Payment**: Specifically test the payment of a $235 fee.
12. **US_012_Fee_Pdf_Download**: Ensure users can download fee receipts as PDFs.

### Attendance and Profile
13. **US_013_Attendance_Feature**: Verify the attendance tracking feature.
14. **US_014_Profile_Picture_Change**: Test the ability to change the profile picture.
15. **US_015_Theme_Change**: Validate the theme change functionality.

### Grading
16. **US_016_Grading_Feature**: Ensure the grading feature works correctly.
17. **US_017_Grading_Print_Feature**: Validate the ability to print grades.

### Assignments
18. **US_018_Assignments_Feature**: Test the general functionality of the assignments feature.
19. **US_019_Assignments_Discussion**: Verify the discussion feature within assignments.
20. **US_020_Assignments_Icons**: Ensure the icons related to assignments are displayed correctly.
21. **US_021_Assignments_Submission**: Test the assignment submission process.
22. **US_022_Assignments_Filter**: Validate the filtering options for assignments.

### Calendar
23. **US_023_Calendar_Status_and_Popups**: Test the status updates and popup notifications in the calendar.
24. **US_024_Calendar_Unstarted_Course**: Verify the display of unstarted courses in the calendar.
25. **US_025_Calendar_Recording**: Ensure the calendar records and updates events correctly.

## Project Structure

- **src/**: Contains the source code for the test scripts.
- **tests/**: Includes all test cases, organized by feature.

## Setup

### Prerequisites

- WebDriver (e.g., Selenium)
- Test framework (e.g., TestNG)
- Behavior-Driven Development Tool (e.g., Cucumber)
