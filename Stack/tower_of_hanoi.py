def toh(n: int, from_rod: str, to_rod: str, aux_rod: str) -> None:
    if n == 1:
        print(f"Move disk 1 from {from_rod} to {to_rod}")
        return
    toh(n-1, from_rod, aux_rod, to_rod)
    print(f"Move disk {n} from {from_rod} to {to_rod}")
    toh(n-1, aux_rod, to_rod, from_rod)

disks = int(input("Enter no. of disks: "))
toh(disks, 'A', 'C', 'B')
