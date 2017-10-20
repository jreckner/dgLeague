-- noinspection SqlNoDataSourceInspectionForFile
INSERT INTO COURSE (NAME) values ('Shadybrook Park');

INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2016 Singles', 'Fall', '2016', 'Singles', true, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2016 Doubles', 'Fall', '2016', 'Doubles', true, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2016 Singles', 'Spring', '2016', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2016 Doubles', 'Spring', '2016', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2015 Singles', 'Fall', '2015', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2015 Doubles', 'Fall', '2015', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2015 Singles', 'Spring', '2015', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2015 Doubles', 'Spring', '2015', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2014 Singles', 'Fall', '2014', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2014 Doubles', 'Fall', '2014', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2014 Singles', 'Spring', '2014', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2014 Doubles', 'Spring', '2014', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2013 Singles', 'Fall', '2013', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2013 Doubles', 'Fall', '2013', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2013 Singles', 'Spring', '2013', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2013 Doubles', 'Spring', '2013', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2012 Singles', 'Fall', '2012', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2012 Doubles', 'Fall', '2012', 'Doubles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2012 Singles', 'Spring', '2012', 'Singles', false, 1);
INSERT INTO LEAGUE (NAME, SEASON, YEAR, TYPE, ACTIVE, COURSE_ID) values ('Fall 2012 Doubles', 'Spring', '2012', 'Doubles', false, 1);

--Singles
INSERT INTO TEAM (NAME) values ('Jon Reckner');
INSERT INTO TEAM (NAME) values ('Ben Johnson');
INSERT INTO TEAM (NAME) values ('Rob Nelson');
INSERT INTO TEAM (NAME) values ('Brad Swanson');

-- Doubles
INSERT INTO TEAM (NAME) values ('Jon Reckner, Ben Johnson');

INSERT INTO PLAYER (NAME, EMAIL) values ('Jon Reckner', 'jreckner@lexmark.com');
INSERT INTO PLAYER (NAME, EMAIL) values ('Ben Johnson', 'johnsonb@lexmark.com');
INSERT INTO PLAYER (NAME, EMAIL) values ('Rob Nelson', 'nelsonr@lexmark.com');
INSERT INTO PLAYER (NAME, EMAIL) values ('Brad Swanson', 'bswanson@lexmark.com');

INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (1, 1);
INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (2, 2);
INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (3, 3);
INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (4, 4);
INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (5, 1);
INSERT INTO TEAM_PLAYERS (TEAMS_ID, PLAYERS_ID) values (5, 2);

INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 1', '2016-08-01', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 2', '2016-08-02', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 3', '2016-08-03', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 4', '2016-08-04', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 5', '2016-08-05', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 6', '2016-08-06', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 7', '2016-08-07', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 8', '2016-08-08', 1);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 9', '2016-08-09', 1);

INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 1', '2016-08-11', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 2', '2016-08-12', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 3', '2016-08-13', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 4', '2016-08-14', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 5', '2016-08-15', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 6', '2016-08-16', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 7', '2016-08-17', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 8', '2016-08-18', 2);
INSERT INTO ROUND  (NAME, PLAYED_ON, LEAGUE_ID) values ('Week 9', '2016-08-19', 2);

INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 1, 1);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 1, 2);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 1, 3);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (28, 1, 4);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 1, 5);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (30, 1, 6);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 1, 7);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 1, 8);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 1, 9);

INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 2, 1);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 2, 2);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 2, 3);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (28, 2, 4);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 2, 5);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (30, 2, 6);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 2, 7);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 2, 8);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 2, 9);

INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 5, 1);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 5, 2);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (25, 5, 3);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (28, 5, 4);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 5, 5);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (30, 5, 6);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 5, 7);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (24, 5, 8);
INSERT INTO SCORE  (SCORE, TEAM_ID, ROUND_ID) values (27, 5, 9);

INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (1, 'red', 242, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (1, 'blue', 302, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (2, 'red', 194, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (2, 'blue', 239, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (3, 'red', 230, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (3, 'blue', 284, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (4, 'red', 210, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (4, 'blue', 240, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (5, 'red', 298, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (5, 'blue', 351, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (6, 'red', 252, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (6, 'blue', 363, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (7, 'red', 390, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (7, 'blue', 441, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (8, 'red', 356, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (8, 'blue', 502, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (9, 'red', 271, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (9, 'blue', 330, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (10, 'red', 234, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (10, 'blue', 343, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (11, 'red', 218, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (11, 'blue', 297, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (12, 'red', 253, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (12, 'blue', 293, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (13, 'red', 215, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (13, 'blue', 344, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (14, 'red', 360, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (14, 'blue', 532, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (15, 'red', 280, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (15, 'blue', 313, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (16, 'red', 223, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (16, 'blue', 223, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (17, 'red', 217, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (17, 'blue', 237, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (18, 'red', 321, 'ft', 1);
INSERT INTO HOLE   (NUMBER, COLOR, DISTANCE, MEASUREMENT_SYSTEM, COURSE_ID) values (18, 'blue', 366, 'ft', 1);

INSERT INTO ACE    (ACHIEVED_ON, PLAYER_ID, HOLE_ID) values ('2016-09-10', 1, 1);

INSERT INTO CTP    (ROUND_ID, PLAYER_ID, HOLE_ID) values (1, 1, 1);
