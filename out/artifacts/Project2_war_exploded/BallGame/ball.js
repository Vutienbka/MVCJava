function Ball(radius, x, y) {
    this.radius = radius;
    this.x = x;
    this.y = y;

    this.move = function (d) {
        this.x += d;
    };

}