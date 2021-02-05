db.movies.insertMany([{
    title : "Fight Club",
writer : "Chuck Palahniuko",
year : 1999,
actors : [
 "Brad Pitt",
 "Edward Norton"
]},
{
title : "Pulp Fiction",
writer : "Quentin Tarantino",
year : 1994,
actors : [
 "John Travolta",
 "Uma Thurman"
]},
{
title : "Inglorious Basterds",
writer : "Quentin Tarantino",
year : 2009,
actors : [
 "Brad Pitt",
 "Diane Kruger",
 "Eli Roth"
]},
{
title : "The Hobbit: An Unexpected Journey",
writer : "J.R.R. Tolkein",
year : 2012,
franchise : "The Hobbit"}
,{
title : "The Hobbit: The Desolation of Smaug",
writer : "J.R.R. Tolkein",
    year : 2013,
franchise : "The Hobbit"},{
title : "The Hobbit: The Battle of the Five Armies",
writer : "J.R.R. Tolkein",
year : 2012,
franchise : "The Hobbit",
synopsis : "Bilbo and Company are forced to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness."},
{title : "Pee Wee Herman's Big Adventure"},
{
title : "Avatar"}
])



db.movies.find()
db.movies.find({writer: "Quentin Tarantino"})
db.movies.find({actors: "Brad Pitt"})
db.movies.find({franchise: "The Hobbit"})
db.movies.find({$and: [{year: {$gt: 1900}}, {year: {$lt: 2000}}]})
db.movies.find({$or: [{year: {$lt: 2000}}, {year: {$gt: 2010}}]})


db.movies.update({title: "The Hobbit: An Unexpected Journey"}, {synopsis: "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."})
db.movies.update({title: "The Hobbit: The Desolation of Smaug"}, {synopsis: "The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."})
db.movies.update({title: "Pulp Fiction"}, {$push: {actors: "Samuel L. Jackson"}})


db.movies.find({$text: {$search: "Bilbo"}})
db.movies.find({$text: {$search: "Gandalf"}})
db.movies.find({$text: {$search: "Bilbo -Gandalf"}})
db.movies.find({$text: {$search: "dwarves hobbit"}})
db.movies.find({$text: {$search: "gold dragon"}})


db.movies.remove({title: "Pee Wee Herman's Big Adventure"})
db.movies.remove({title: "Avatar"})

db.users.find()
db.posts.find()
db.posts.find({username: "GoodGuyGreg"})
db.posts.find({username: "ScumbagSteve"})
db.comments.find()
db.comments.find({username: "GoodGuyGreg"})
db.comments.find({username: "ScumbagSteve"})
db.comments.find({"post":posts.find_one({"title":"Reports a bug in your code"})["_id"]})
