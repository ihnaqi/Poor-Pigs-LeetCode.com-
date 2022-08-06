# Poor Pigs

## Project Description

The problem occured to me while solving problems on `leetcode.com`, _here is the link_ [click here](https://leetcode.com/problems/poor-pigs/). This poblem is a **<hard>** problem categorired by `leetcode.com`

### Problem Details

We are given a number of `buckets` containing fluids such that **exactly one** of the `buckets` contains _poisonous_ liquid. To find the _poisonous_ `bucket` we need to _feed_ some pigs, **poor pigs**, to check whether they will die or not. But, the problem is we need to carry out the test only in a given amount of time called `timeToTest`.

##### Pigs, **Poor**, can be feed accordingly

- Choose some pigs to feed
- Each pig must be made to drink from a unique `bucket` simultaneously
- Once the _pigs_ have had their drink wait for `minutesToDie`. During the wait period one may **not** feed any other _pig_.
- After the given time, `minutesToDie` have been passed those _pigs_ who have drunk **poison** will die while the rest will survive.
- This process should be repeated until one runs out ot time, i.e, `timeToTest`.

> Given `buckets`, `minutesToDie` and `minutesToTest`, return **minimum** number of pigs needed to figure out which bucket is poisonous within the allocated time.

##### Caveat

- `1 <= buckets <= 1000`
- `1 <= minutesToDie <= minutesToTest <= 100`

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `test`: the folder contains the test cases written the file
- `.gitignore`: the holds the list of files which would not be uploaded to **GitHub** repository

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
