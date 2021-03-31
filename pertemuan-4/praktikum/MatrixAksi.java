public class MatrixAksi {
    public static void main(String[] args) {
        // double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3 } };
        // Matrix D = new Matrix(d);
        // D.show();

        // membuat matriks random
        Matrix matriks_A = Matrix.random(2, 2);
        System.out.println("matriks A=");
        matriks_A.show();
        System.out.println();

        // transpose dari matriks A;
        Matrix hasil_Transpose = matriks_A.transpose();
        System.out.println("Matriks B=");
        hasil_Transpose.show();
        System.out.println();

        // matriks identitas
        Matrix hasilMatriks_Identitas = Matrix.identity(3);
        System.out.println("matriks c=");
        hasilMatriks_Identitas.show();
        System.out.println();

        // penjumlahan matriks A dan B
        Matrix hasil_JumlahMatriks = matriks_A.plus(hasil_Transpose);
        System.out.println("hasil penjumlahan matriks=");
        hasil_JumlahMatriks.show();
        System.out.println();

        // hasil kali 2 matriks
        Matrix hasil_kaliMatrix = matriks_A.times(hasil_Transpose);
        System.out.println("hasil perkalian matriks=");
        hasil_kaliMatrix.show();

        // Matrix A = new Matrix(2, 1);
        // A.swap(1, 2);
        // A.show();
        // System.out.println();
        // // shouldn't be equal since AB != BA in general
        // System.out.println(A.times(B).eq(B.times(A)));
        // System.out.println();

        // Matrix b = Matrix.random(5, 1);
        // b.show();
        // System.out.println();

        // Matrix x = A.solve(b);
        // x.show();
        // System.out.println();

        // A.times(x).show();
    }
}
