public class PaintJob {


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalArea = width * height;
        double bucketsNeeded = Math.ceil(totalArea / areaPerBucket);
        int additionalBucketsNeeded = (int) Math.max(0, bucketsNeeded - extraBuckets);

        return additionalBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width * height;
        double bucketsNeeded = Math.ceil(totalArea / areaPerBucket);

        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeeded = Math.ceil(area / areaPerBucket);

        return (int) bucketsNeeded;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Output: 2
        System.out.println(getBucketCount(10, 15.5, 5.5, 11)); // Output: 3
        System.out.println(getBucketCount(25.0,5.0)); // Output: -1
        System.out.println(getBucketCount(3.4, 2.1, 0, 2)); // Output: -1
    }
}
