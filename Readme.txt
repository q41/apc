Tests can be found at "BallAndPaddle Base\src\Tests". 
A description of what each test does can be found inside the Tests.pdf file.
Each group of tests has it's own folder with a .pdf file containing the expected results of the tests.
Each test has it's own .launch file so it is easy to run them.

Examples can be found at "BallAndPaddle Base\src\Examples"
Each example has it's own .launch file so it is easy to run them.
Be warned that the big example is really big and likely has performance issues, with very low fps.
The small example on the other hand should perform fine.

when running the program the following Program arguments can be used:
-width:int 
-height:int 
-smooth
-testing

Width and height speak for themselves. 
By using -smooth the game will switch from using the system time to using our own clock. 
Normally the system clock is used, but effects that are active for 10 seconds would stop working after 10 seconds,
not caring if the game ran at 10fps (and thus 10 updates per second) or 30 fps.
With the -smooth version the duration of the effects is instead linked to the amount of frames at a rate of 30fps.
So if the performance of the game drops to 10fps in -smooth mode, then that 10 second effect lasts for 30 seconds.


The following VM arguments should be used in order to make the game run:
-javaagent:"${workspace_loc:/ALIA4J NOIRIn libraries/lib/alia4j-noirin-core.jar}"
-Dorg.alia4j.importer=org.alia4j.languages.bp.importer.Importer
-Dbp.main=Examples/Small/smallGame					
-Dorg.alia4j.exclude=org.lwjgl,bp.base.renderer.TextRenderer

for the -Dbp.main= part you can replace the Examples/Small/smallGame with the location of the .xmi file that you wish to run