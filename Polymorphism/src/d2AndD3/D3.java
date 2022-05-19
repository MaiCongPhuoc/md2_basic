package d2AndD3;

public class D3 extends D2 {
    private float z = 0.0f;
    public D3(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public D3() {

    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.getX();
        super.getY();
        this.z = z;
    }
    public float[] getXYZ (float[] arr, float x, float y, float z) {
        return arr = new float[]{x, y, z};
    }

    @Override
    public String toString() {
        return "array is: ("+ getX() + ", "+ getY() +", "+ z +")";
    }
}
