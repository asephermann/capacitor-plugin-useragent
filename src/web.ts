import { WebPlugin } from '@capacitor/core';

import type { UserAgentPlugin } from './definitions';

export class UserAgentWeb extends WebPlugin implements UserAgentPlugin {
  async set(_options: { value: string; }): Promise<{ value: string; }> {
    throw new Error('Method not implemented.');
  }
  async get(): Promise<{ value: string; }> {
    throw new Error('Method not implemented.');
  }
  async reset(): Promise<{ value: string; }> {
    throw new Error('Method not implemented.');
  }
}
