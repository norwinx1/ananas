INSERT INTO YOUTUBERS_ENTITY(RANK, USERNAME, YOUTUBE_URL, NAME, CATEGORY, AMOUNT_SUBSCRIBERS, COUNTRY, AVG_VIEWS, AVG_LIKES, AVG_COMMENTS) ((SELECT * FROM CSVREAD('src/main/resources/top_1000_youtubers.csv')))