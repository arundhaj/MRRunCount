MRRunCount
==========

Simple MapReduce job to calculate the total runs scored by each player in baseball.

Data used from the following source.

http://seanlahman.com/files/database/lahman591-csv.zip

<code>Batting.csv</code> file contains list of all players and separate records for every match the player has appeared.

This MapReduce job finds the total runs by each player on all matches.

The input file used for the job is <code>Batting.csv</code> and the output generated by the job is <code>part-r-00000</code>
