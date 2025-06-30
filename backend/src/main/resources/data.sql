-- === Exercise 1: Driving Position ===
INSERT INTO exercise (id, title) VALUES (1, 'Exercise 1: Driving Position');
INSERT INTO task (id, description, exercise_id) VALUES
  (1, 'Driving position', 1),
  (2, 'Starting the engine', 1);

-- === Exercise 2: Initial Maneuvering ===
INSERT INTO exercise (id, title) VALUES (2, 'Exercise 2: Initial Maneuvering');
INSERT INTO task (id, description, exercise_id) VALUES
  (3, 'Starting and stopping', 2),
  (4, 'Creeping', 2),
  (5, 'Steering', 2),
  (6, 'Creeping and steering combined', 2);

-- === Exercise 3: Gear Shifting and Braking ===
INSERT INTO exercise (id, title) VALUES (3, 'Exercise 3: Gear Shifting and Braking');
INSERT INTO task (id, description, exercise_id) VALUES
  (7, 'Upshifting', 3),
  (8, 'Smooth braking', 3),
  (9, 'Downshifting', 3),
  (10, 'Downshifting before turning', 3);

-- === Exercise 4: Maneuvering on Inclines ===
INSERT INTO exercise (id, title) VALUES (4, 'Exercise 4: Maneuvering on Inclines');
INSERT INTO task (id, description, exercise_id) VALUES
  (11, 'Starting uphill with parking brake', 4),
  (12, 'Starting uphill without parking brake', 4),
  (13, 'Temporary stop on an incline (hill-hold)', 4),
  (14, 'Starting downhill', 4);

-- === Exercise 5: Reversing and Precision Driving ===
INSERT INTO exercise (id, title) VALUES (5, 'Exercise 5: Reversing and Precision Driving');
INSERT INTO task (id, description, exercise_id) VALUES
  (15, 'Reversing', 5),
  (16, 'Precision driving', 5);

-- === Exercise 6: Safety Check ===
INSERT INTO exercise (id, title) VALUES (6, 'Exercise 6: Safety Check');
INSERT INTO task (id, description, exercise_id) VALUES
  (17, 'Internal safety check', 6),
  (18, 'External safety check', 6);

-- === Exercise 7: Coordinated Maneuvering ===
INSERT INTO exercise (id, title) VALUES (7, 'Exercise 7: Coordinated Maneuvering');
INSERT INTO task (id, description, exercise_id) VALUES
  (19, 'Combine exercises 1–6 independently', 7);

-- === Exercise 8: Driving on Roads with Light Traffic ===
INSERT INTO exercise (id, title) VALUES (8, 'Exercise 8: Driving on Roads with Light Traffic');

-- === Exercise 9: Driving on Minor Country Roads ===
INSERT INTO exercise (id, title) VALUES (9, 'Exercise 9: Driving on Minor Country Roads');
INSERT INTO task (id, description, exercise_id) VALUES
  (20, 'Driving on minor country roads', 9),
  (21, 'Acceleration and hard braking', 9);

-- === Exercise 10: Driving on Streets with Heavier Traffic ===
INSERT INTO exercise (id, title) VALUES (10, 'Exercise 10: Driving on Streets with Heavier Traffic');
INSERT INTO task (id, description, exercise_id) VALUES
  (22, 'Starting and stopping', 10),
  (23, 'Right turn at intersection', 10),
  (24, 'Driving straight in intersection, two-way street', 10),
  (25, 'Driving straight in intersection, one-way street', 10),
  (26, 'Left turn from two-way street', 10),
  (27, 'Left turn from one-way street', 10),
  (28, 'Passing pedestrian crossings', 10);

-- === Exercise 11: Turning Around and Parking ===
INSERT INTO exercise (id, title) VALUES (11, 'Exercise 11: Turning Around and Parking');
INSERT INTO task (id, description, exercise_id) VALUES
  (29, 'Turning around', 11),
  (30, 'Parking', 11);

-- === Exercise 12: Speed, Lanes and Roundabouts ===
INSERT INTO exercise (id, title) VALUES (12, 'Exercise 12: Speed, Lanes and Roundabouts');
INSERT INTO task (id, description, exercise_id) VALUES
  (31, 'Speed adjustment and lane changes', 12),
  (32, 'Driving in roundabouts', 12);

-- === Exercise 13: Destination Navigation and Signs ===
INSERT INTO exercise (id, title) VALUES (13, 'Exercise 13: Destination Navigation and Signs');

-- === Exercise 14: Advanced Urban Traffic Application ===
INSERT INTO exercise (id, title) VALUES (14, 'Exercise 14: Advanced Urban Traffic Application');
INSERT INTO task (id, description, exercise_id) VALUES
  (33, 'Combine exercises 10–13 independently', 14);

-- === Exercise 15: Country Roads, On/Off Ramps, Braking ===
INSERT INTO exercise (id, title) VALUES (15, 'Exercise 15: Country Roads, On/Off Ramps, Braking');
INSERT INTO task (id, description, exercise_id) VALUES
  (34, 'Starting and stopping', 15),
  (35, 'On-ramps and off-ramps', 15),
  (36, 'Emergency braking on dry surface', 15);

-- === Exercise 16: Motorway and Expressway Driving ===
INSERT INTO exercise (id, title) VALUES (16, 'Exercise 16: Motorway and Expressway Driving');

-- === Exercise 17: Meeting and Left-Side Overtaking ===
INSERT INTO exercise (id, title) VALUES (17, 'Exercise 17: Meeting and Left-Side Overtaking');
INSERT INTO task (id, description, exercise_id) VALUES
  (37, 'Meeting traffic', 17),
  (38, 'Overtaking on the left', 17);

-- === Exercise 18: Application on Varying Country Roads ===
INSERT INTO exercise (id, title) VALUES (18, 'Exercise 18: Application on Varying Country Roads');
INSERT INTO task (id, description, exercise_id) VALUES
  (39, 'Applied exercise', 18),
  (40, 'Passing railroad crossings', 18),
  (41, 'Actions in case of engine failure', 18);

-- === Exercise 19: Night Driving ===
INSERT INTO exercise (id, title) VALUES (19, 'Exercise 19: Night Driving');

-- === Exercise 20: Slippery Surface Driving ===
INSERT INTO exercise (id, title) VALUES (20, 'Exercise 20: Slippery Surface Driving');

-- === Exercise 21: Training Evaluation ===
INSERT INTO exercise (id, title) VALUES (21, 'Exercise 21: Training Evaluation');
