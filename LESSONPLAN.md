### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/nfATQ1tnguVw5mVK7)

#### Daily Resources

* [Guided Project Starter](https://github.com/LambdaSchool/java-usermodel/tree/master/usermodel_initial)
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
For the Java class today, I will start from the application found in [https://github.com/LambdaSchool/java-usermodel/tree/master/usermodel_initial](https://github.com/LambdaSchool/java-usermodel/tree/master/usermodel_initial). So, you will need copy of this in order to follow along!
The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

When was that user added?
Who changed that restaurant's phone number?
Can I get of count of restaurants by state?

These real questions that our data should be able to answer. In this guided project, we will learn how to answer those questions and more!

### Purpose

Today we add some important features to our CRUD Application:

* Audit Fields, who did what when?
* Custom Reports - I want THAT data!
* Improve our handling of many to many relationships.

### Learning Activities

* New routes the get created in this process are
  * PATCH http://localhost:2019/roles/role/3
  * DELETE localhost:2019/roles/role/3
  * http://localhost:2019/users/user/email/count
  * DELETE http://localhost:2019/users/user/7/role/2
  * POST http://localhost:2019/users/user/15/role/2
  * http://localhost:2019/useremails/username/cinnamon

#### Working with objective: Add additional fields to a Many to Many Join Table

* Split Many to Many to 2 One to Many Relationship
  * Add models.UserRoles
  * Models - remember to add new getter and setter and remove old ones
  * Update Services to adapt
    * This especially affects UserServiceImpl
  * Update SeedData to use UserRole
  * Need to update how roles are sent in JSON
  * Controllers do not change!!!

* [Check for Understanding CFU - Google Form](https://forms.gle/g2z7wdKt5WBW8D5fA)

#### Working with objective: Add standard auditing fields to each table

* Add Auditing Fields
  * models.Auditable
  * Each model needs to extend Auditable
  * Add services.UserAuditing
  * Add @EnableJpaAuditing to your main class

* [Check for Understanding CFU - Google Form](https://forms.gle/7XdtMtnTcx5hfXEw7)

#### Working with objective: Populate and display standard auditing fields

* Run the application
  * Show how the fields are in the tables using H2Console
  * Show how the fields are not in the JSON output by surfing to http://localhost:2019/useremails/useremails in Postman
    * No getters so no fields in JSON!
    * Add getters to Auditable and run again
      * Now you see all the audit fields!
      * If you want audit fields on just a single table,
        * DO NOT add to Auditable.
        * Just add them to the table you want them!
          * These have to be manually typed in and cannot be generated
          * There is one commented out in models.Role

* [Check for Understanding CFU - Google Form](https://forms.gle/kHJDeJkdLWiXpVei9)

#### Working with objective: Use SQL, JPA and Hibernate to perform custom query operations on a RDBMS through a Spring Application

* Add Custom Query Reading (views.UserNameCountEmails)
  * Add views.UserNameCountEmails
  * Add UserRepository.getCountUserEmails
  * Add UserController.getNumUserEmails
  * Add views.JustTheCount - needed for later. Explain how this is a general count interface and can be used for multiple counts
  * Add UserRepository.checkUserRolesCombo

* [Check for Understanding CFU - Google Form](https://forms.gle/NstYdHkaYA4pP9Cy9)

#### Working with objective: Use SQL, JPA and Hibernate to perform custom data manipulation operations on a RDBMS through a Spring Application

* Add features to work with Roles
  * UserController.deleteUserRoleByIds
  * UserController.postUserRoleByIds
  * UserService.deleteUserRole + implementation
  * UserService.addUserRole + implementation
  * UserRepository.deleteUserRoles
  * UserRepository.insertUserRoles

* [Check for Understanding CFU - Google Form](https://forms.gle/JF1f3eR2UYYccsFr7)

### Objectives to Cover if Time Permits

#### Working with objective: Implement default Swagger Documentation

* Add Swagger so we can see good REST API documentation like we have for our database
  * Dependencies
  * Configuration File (config.Swagger2Config)
    * Update info

* [Check for Understanding CFU - Google Form](https://forms.gle/n3jX4sRG2m8GpFwS7)

#### Working with objective: Print the default Swagger documentation

* [https://editor.swagger.io/](https://editor.swagger.io/)
  * Generate Bash Client for Markdown
  * Generate HTML for PDF

* [Check for Understanding CFU - Google Form](https://forms.gle/SXVxmHc6QXYw2WNU7)

#### Review JPA Advance Queries

* Review - add find user emails from username
  * Add UseremailController.findUseremailByName

## Closing

### Conclusion

#### Review what we just learned

* Improved handling of Many To Many Relationships
* Added Auditing fields to all our tables
* Added custom queries to our application
* Added Swagger Documentation

#### How is this related to tomorrow's topic

* We added to the functionality of our CRUD Application
* We will continue adding functionality until we have a production ready application!

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/Gox3qB99zQUMWDBF9)
