# Dark Souls Boss Database

This is the back end repository for a Database that stores infomation for the Bosses in the Dark Souls game series. This project was created as part of the Nology developer course over a period of 1 week. The goal of the project was to create an full stack project which interacts with a database by creating, reading, updating and deleting records. The programs used to create the project were .

## Buit Using
- Java
- Spring
- MySQL
- React
- SCSS

## Programs Used
- Visual Studio Code
- IntelliJ
- Postman
- MySQL WorkBench
- Spring Initializr

## Landing Page

When the website first loads the user is shown the landing page, from here they can navigate to the Bosses page or to the Create Boss Page.

![Screenshot of Landing Page](https://raw.githubusercontent.com/LewisLovett/dark-souls-database-front-end/main/src/assets/images/readme_images/landing_page.png)

## Bosses Page

On the Bosses page each Boss record is displayed using the Boss component and arranged in a list using the Boss List Component. Each Boss record stores the Boss name, Boss Health, Amount of Souls gained after defeating the Boss, an image of the Boss, which game the Boss appears in, a short description of the Boss and the Boss' theme. This infomation is stores in a MySQL database and is accessed using an api.

![Screenshot of Bosses Page 1](https://raw.githubusercontent.com/LewisLovett/dark-souls-database-front-end/main/src/assets/images/readme_images/bosses_page.png)

The user can filter through the Bosses by name and game appearance. They can also sort the Boss List by name health or souls.

![Screenshot of Bosses Page 2](https://raw.githubusercontent.com/LewisLovett/dark-souls-database-front-end/main/src/assets/images/readme_images/bosses_filtered_page.png)

## Edit Boss Page

When the user click the 'Edit' button on a Boss component they are taken to the Edit page for that Boss. Here they can edit the details of the Boss and when they click submit and API PUT call is made and the record is updated.

![Screenshot of Edit Boss Page](https://raw.githubusercontent.com/LewisLovett/dark-souls-database-front-end/main/src/assets/images/readme_images/edit_page.png)

## Create Boss Page

On the Create Boss page the user is asked to enter the details for a new Boss. Once they click submit the new Boss is added to the database using an API POST call. An important note is that the boss images and music are saved locally on the front end so when a new boss is created a placeholder image and mp3 are used when initialising the Boss component.

![Screenshot of Create Boss Page](https://raw.githubusercontent.com/LewisLovett/dark-souls-database-front-end/main/src/assets/images/readme_images/create_page.png)
