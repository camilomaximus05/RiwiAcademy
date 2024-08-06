package RiwiAcademy.Persistence.CRUD;

public interface Readmodel<Entity> {
    public Entity readById(Entity entity);
}
