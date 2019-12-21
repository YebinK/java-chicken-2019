package view;

import domain.Menu;
import domain.Table;

import java.util.List;

/**
 * 정보를 출력하는 클래스
 */
public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String ORDERED_BOTTOM_LINE = "└ O ┘";

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size, tables);
        printTableNumbers(tables);
        printLine(BOTTOM_LINE, size, tables);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count, final List<Table> tables) {
        for (Table table : tables) {
            if (line == BOTTOM_LINE && table.isOrdered()) {
                System.out.print(ORDERED_BOTTOM_LINE);
                continue;
            }
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printOrderedMenus(final Table table) {
        System.out.println("## 주문 내역");
        System.out.println("메뉴 \t수량 \t금액");
        table.printOrderList();
    }
}
