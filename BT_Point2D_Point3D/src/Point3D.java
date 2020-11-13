public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setY(y);
        super.setX(x);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] getXYZ = new float[3];
        getXYZ[0] = this.getX();
        getXYZ[1] = this.getY();
        getXYZ[2] = this.getZ();
        return getXYZ;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public float getY() {
        return super.getY();
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }

    @Override
    public String toString() {
        return "Point3D{" + "z=" + z + "\n x =" + getX() + "\n y=" + getY()+'}';
    }
}

