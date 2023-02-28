const express = require('express');
const app = express();
app.use(express.json());
app.use('/triangle', require('./routes/triangle.route'));
module.exports = app;
