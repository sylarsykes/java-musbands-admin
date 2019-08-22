-- Function member
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Lead vocalist', 'The lead vocalist in popular music is typically the member of a group or band whose voice is the most prominent in a performance where multiple voices may be heard. The lead singer either leads the vocal ensemble, or sets against the ensemble as the dominant sound. In vocal group performances, notably in soul and gospel music, and early rock and roll, the lead singer takes the main vocal part, with a chorus provided by other band members as backing vocalists. Especially in rock music, the lead singer or solo singer is often the front man or front woman, who may also play one or more instruments and is often seen as the leader or spokesman of the band by the public. As an example in rock music, Freddie Mercury was the lead singer of Queen. Similarly in soul music, Smokey Robinson was the lead singer of The Miracles.', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Vocal', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Lead Guitar', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Guitar', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Rhythm Guitar', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Drum', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Bass', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Programming', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member`(`name`, `description`, `created_at`) VALUES ('Keyboard', NULL, CURRENT_TIMESTAMP);

-- Function member synonymic
INSERT INTO `musbands_admin`.`function_member_synonymic`(`name`, `created_at`) VALUES ('Main vocalist', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`function_member_synonymic`(`name`, `created_at`) VALUES ('Lead vocals', CURRENT_TIMESTAMP);

-- function_member_synonymic_functionmembers
INSERT INTO `musbands_admin`.`function_member_synonymic_functionmembers`(`function_member_synonymic_id`, `function_member_id`) VALUES (1, 1);
INSERT INTO `musbands_admin`.`function_member_synonymic_functionmembers`(`function_member_synonymic_id`, `function_member_id`) VALUES (2, 1);

-- Instrument
INSERT INTO `musbands_admin`.`instrument`(`name`, `created_at`) VALUES ('Vocal', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`instrument`(`name`, `created_at`) VALUES ('Guitar', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`instrument`(`name`, `created_at`) VALUES ('Drum', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`instrument`(`name`, `created_at`) VALUES ('Bass', CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`instrument`(`name`, `created_at`) VALUES ('Keyboard', CURRENT_TIMESTAMP);

-- Musical Genre
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Metalcore', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Alternative metal', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Alternative rock', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Pop rock', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Electronic rock', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Death core', NULL, CURRENT_TIMESTAMP);
INSERT INTO `musbands_admin`.`musical_genre`(`name`, `description`, `created_at`) VALUES ('Pop punk', NULL, CURRENT_TIMESTAMP);