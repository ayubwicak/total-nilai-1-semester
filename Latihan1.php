<?php

# The following function is called whenever your program needs to input data.
# You can change it to use other sources rather than fgets().
function input() {
    return fgets(STDIN);
}
echo "Masukkan Nilai Tugas =" . PHP_EOL;
$tugas1 = input();
echo "Masukkan Nilai Kuis =" . PHP_EOL;
$kuis1 = input();
echo "Masukkan Nilai UTS =" . PHP_EOL;
$uts1 = input();
echo "Masukkan Nilai UAS =" . PHP_EOL;
$uas1 = input();
$tugas = $tugas1 * 0.2;
$kuis = $kuis1 * 0.1;
$uts = $uts1 * 0.3;
$uas = $uas1 * 0.4;
$hasil = $tugas + $kuis + $uts + $uas;
echo "Hasil =" . $hasil . PHP_EOL;
?>
