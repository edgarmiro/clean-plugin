# clean-plugin
Create the Clean Architecture directory structure in your projects

![Clean Architecture](https://8thlight.com/blog/assets/posts/2012-08-13-the-clean-architecture/CleanArchitecture-8d1fe066e8f7fa9c7d8e84c1a6b0e2b74b2c670ff8052828f4a7e73fcbbc698c.jpg "Clean Architecture")

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
