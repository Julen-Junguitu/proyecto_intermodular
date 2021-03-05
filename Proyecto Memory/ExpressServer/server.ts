const mongoose = require('mongoose');
const express = require('express');
const bodyParser = require('body-parser');

// Connecting to Mongoo Atlas database
 mongoose.connect('mongodb+srv://memory:puzzle@cluster0.9e0uu.mongodb.net/scores_db?retryWrites=true&w=majority', {
   useNewUrlParser: true,
   useUnifiedTopology: true
 });

const app = express();

let scoresSchema = new mongoose.Schema({
  name: {
    type: String,
    required: true,
    minlength: 1,
    trim: true
  },
  points: {
    type: String,
    required: true,
    minlength: 1,
    trim: true
  }
});
let Score = mongoose.model('scores', scoresSchema);


app.use(function (req: any, res: any, next: any) {
  res.header("Access-Control-Allow-Origin", "*"); // update to match the domain you will make the request from
  res.header("Access-Control-Allow-Methods", 'GET,PUT,POST,DELETE,OPTIONS');
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

app.use(
  bodyParser.urlencoded({
    extended: true
  })
)

app.use(bodyParser.json())


app.get('/scores', async (req:any, res:any) => {
  const scores = await Score.find({});
  console.log(scores);
  
  try {
    res.send(scores);
  } catch (err) {
    res.status(500).send(err);
  }
});


app.post('/scores', async (req:any, res:any) => {
  const score = new Score({
		name: req.body.name,
		points: req.body.points
	});

  try {
    await score.save();
    res.send(score);
  } catch (err) {
    res.status(500).send(err);
  }
});

app.delete('/scores/:id', async (req:any, res:any) => {
  try {
    const score = await Score.findByIdAndDelete(req.params.id)

    if (!score) res.status(404).send("No item found")
    res.status(200).send()
  } catch (err) {
    res.status(500).send(err)
  }
});


// start the server listening for requests
app.listen(process.env.PORT || 3000, 
	() => console.log("Server is running..."));