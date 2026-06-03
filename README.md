# clean-plugin
Create the Clean Architecture directory structure in your projects.
[https://plugins.jetbrains.com/plugin/10175-clean-architecture-plugin](https://plugins.jetbrains.com/plugin/10175-clean-architecture-plugin)

<img width="772" height="567" alt="CleanArchitecture" src="https://github.com/user-attachments/assets/6a7c4655-125e-4817-8487-ff26546dee78" />


# Install
- IntelliJ IDEA -> Plugins -> Browse repositories
- Search: Clean Architecture Plugin
- Install & Restart IntelliJ IDEA

# How To
- Right click on your destination folder
- New -> Create Clean structure

# Result
- The plugin will create the following folder structure:
  - data
    - sources
      - local
        - mappers
        - models
      - server
        - mappers
        - models
  - domain
    - models
    - usecase
  - presentation
    - features
    - mappers
    - models
  
# Links
- https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html
