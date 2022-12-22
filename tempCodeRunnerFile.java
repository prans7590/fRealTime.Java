n = 8;
            for (int ss = 0; ss < n; ss++) {
            for (int t = 0; t < n; t++) {
            if (ss == n - 1 || t == n - 1 || ss == (n - 1) / 2) {
            System.out.print("*");
            } else {
            System.out.print(" ");
            }

            }
            System.out.println("");

            }