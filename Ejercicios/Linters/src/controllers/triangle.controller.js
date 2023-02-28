const triangleController = {
    getArea: (sideA, sideB, sideC) => {
        const s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * ((s - sideA) * (s - sideB) * (s - sideC)));
    }
};

module.exports = triangleController;