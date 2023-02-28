const express = require('express');
const router = new express.Router();

const {handleError} = require('../utils/hof');


const triangleController = require('../controllers/triangle.controller');

router.get('/area', handleError(async (req, res) => {
  const {sideA, sideB, sideC} = req.query;

  const area = triangleController.getArea(
      parseInt(sideA),
      parseInt(sideB),
      parseInt(sideC));

  res.send({area});
}));

module.exports = router;
