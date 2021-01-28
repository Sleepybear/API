package org.cloudburstmc.api.enchantment.behavior;

import org.cloudburstmc.api.enchantment.EnchantmentInstance;
import org.cloudburstmc.api.entity.Entity;
import org.cloudburstmc.api.item.ItemStack;

public abstract class EnchantmentBehavior {
    public int getWeight(EnchantmentInstance enchantment) {
        return enchantment.getType().getWeight();
    }

    public int getMaxLevel(EnchantmentInstance enchantment) {
        return enchantment.getType().getMaxLevel();
    }

    public int getMaxEnchantableLevel(EnchantmentInstance enchantment) {
        return getMaxLevel(enchantment);
    }

    public int getMinEnchantAbility(int level) {
        return 1 + level * 10;
    }

    public int getMaxEnchantAbility(int level) {
        return this.getMinEnchantAbility(level) + 5;
    }

   /* public float getProtectionFactor(EnchantmentInstance enchantment, EntityDamageEvent event) { //todo
        return 0;
    }*/

    public float getDamageBonus(EnchantmentInstance enchantment, Entity entity) {
        return 0;
    }

    public void doPostAttack(EnchantmentInstance enchantment, Entity entity, Entity attacker) {

    }

    public void doPostHurt(EnchantmentInstance enchantment, Entity entity, Entity attacker) {

    }

    public boolean isCompatibleWith(EnchantmentInstance first, EnchantmentInstance enchantment) {
        return first != enchantment;
    }

    public boolean canEnchant(EnchantmentInstance enchantment, ItemStack item) {
        return enchantment.canEnchantItem(item);
    }

    public boolean isMajor() {
        return false;
    }

}