# Kotlin `removeIf` Function Behavior with MutableList and MutableSet

This example demonstrates an important difference in how Kotlin's `removeIf` function behaves when applied to `MutableList` and `MutableSet` collections.  The difference lies in how element removal impacts iteration.

## Problem Description

When using `removeIf` with a `MutableList`, elements are removed during the iteration process, changing the list's size and affecting subsequent iterations.  However, with `MutableSet`, the iteration is not affected by the removals, leading to unexpected outcomes if removal conditions are not carefully considered.

## Solution

The solution involves understanding the iterative process of `removeIf` with each collection type and adjusting the logic if necessary to achieve the intended result.  For `MutableSet`, consider creating a separate list to store elements to be removed or using alternative methods like `removeAll` which does not modify the set while iterating.  For `MutableList`, it is important to account for potential index issues when removing elements.