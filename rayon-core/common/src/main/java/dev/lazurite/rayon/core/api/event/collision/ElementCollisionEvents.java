package dev.lazurite.rayon.core.api.event.collision;

import dev.architectury.event.Event;
import dev.architectury.event.EventFactory;
import dev.lazurite.rayon.core.api.PhysicsElement;
import dev.lazurite.rayon.core.impl.bullet.collision.body.ElementRigidBody;
import dev.lazurite.rayon.core.impl.bullet.collision.body.TerrainObject;

/**
 * @since 1.0.0
 */
public class ElementCollisionEvents {
    public static final Event<TerrainCollision> TERRAIN_COLLISION = EventFactory.createLoop();

    public static final Event<ElementCollision> ELEMENT_COLLISION = EventFactory.createLoop();

    private ElementCollisionEvents() { }

    @FunctionalInterface
    public interface TerrainCollision {
        /**
         * Invoked each time an {@link ElementRigidBody} collides with a {@link TerrainObject}.
         * @param element the element
         * @param terrainObject the terrain object
         * @param impulse the impulse generated by the collision
         */
        void onCollide(PhysicsElement element, TerrainObject terrainObject, float impulse);
    }

    @FunctionalInterface
    public interface ElementCollision {
        /**
         * Invoked each time an {@link ElementRigidBody} collides with another {@link ElementRigidBody}.
         * @param element1 the first element
         * @param element2 the second element
         * @param impulse the impulse generated by the collision
         */
        void onCollide(PhysicsElement element1, PhysicsElement element2, float impulse);
    }
}