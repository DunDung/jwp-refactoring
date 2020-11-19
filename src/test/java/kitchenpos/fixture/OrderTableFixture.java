package kitchenpos.fixture;

import kitchenpos.domain.OrderTable;
import kitchenpos.domain.TableGroup;

import static kitchenpos.fixture.TableGroupFixture.createTableGroupWithoutId;

public class OrderTableFixture {

    public static OrderTable createOrderTable(Long id, TableGroup tableGroup, int numberOfGuests, boolean empty) {
        return new OrderTable(id, tableGroup, numberOfGuests, empty);
    }

    public static OrderTable createOrderTableWithId(Long id) {
        return createOrderTable(id, createTableGroupWithoutId(), 1, true);
    }

    public static OrderTable createOrderTableWithoutId() {
        return createOrderTable(null, null, 1, false);
    }

    public static OrderTable createOrderTableWithEmpty(boolean empty) {
        return createOrderTable(null, null, 1, empty);
    }

    public static OrderTable createOrderTableWithNumberOfGuest(int numberOfGuest) {
        return createOrderTable(null, null, numberOfGuest, false);
    }

    public static OrderTable createOrderTableWithTableGroupId(TableGroup tableGroup) {
        return createOrderTable(null, tableGroup, 2, false);
    }
    /*
    public static OrderTable createOrderTableWithTableGroupIdAndEmpty(Long tableGroupId, boolean empty) {
        return createOrderTable(null, 2, tableGroupId, empty);
    }



     */
}
