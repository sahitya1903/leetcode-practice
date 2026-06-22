# LeetCode Practice

This repository holds solutions to various LeetCode problems across multiple programming languages.

---

## ⚙️ Synchronization Workflow

The repository is configured with a GitHub Actions workflow to automatically synchronize submissions from LeetCode.

- **Workflow File:** [.github/workflows/leetcode_sync.yml](.github/workflows/leetcode_sync.yml)
- **Action Used:** `joshcai/leetcode-sync@v1.7`
- **Schedule:** Runs daily at `08:00 UTC` and can be manually triggered via `workflow_dispatch`.
- **Required Secrets:**
  - `LEETCODE_CSRF_TOKEN`: CSRF token from LeetCode session.
  - `LEETCODE_SESSION`: Session cookie from LeetCode.

---

## 📂 Folder Structure

Each solved problem is stored in its own directory named in the format `{problem_number}-{problem-slug}`:
- **`README.md`**: Contains the description and constraints of the problem.
- **`solution.{ext}`**: The actual code solution in the respective language.

---

## 📄 License

This repository is licensed under the [MIT License](LICENSE).